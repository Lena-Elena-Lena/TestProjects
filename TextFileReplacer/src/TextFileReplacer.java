import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileReplacer {
    static String str_PathName="C:\\Users\\razgulyaeva\\Documents\\ROSTELECOM\\test_txt";
    static String srcFName = "srcTest";
    static String destFName = "resultTest";
    static String str;

    private String read() {
        File fl=new File(str_PathName+"\\"+srcFName+".sql");
        //Этот спец. объект для построения строки
       // StringBuilder sb = new StringBuilder();
        Set<String> lstr=new TreeSet<>();

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(fl));
            try {
                Pattern p_start1=Pattern.compile("(utterance\\\":\\\"){1}");
                Pattern p_end1=Pattern.compile("(\\\")");
                Matcher m_start1;
                Matcher m_end1;
                Pattern p_start2=Pattern.compile("(q_name\\\":\\\"){1}");
                Pattern p_end2=Pattern.compile("(\\\")");
                Matcher m_start2;
                Matcher m_end2;
                //В цикле построчно считываем файл
                String s;
                String s1;
                String s2;
                while ((s = in.readLine()) != null) {

                        m_start1 = p_start1.matcher(s);

                        int n1 = 0;
                        boolean b1 = m_start1.find();
                        if (b1) {
                            n1 = m_start1.end();
                        }
                        //  System.out.println(s.length());
                        s1 = s.substring(n1);
                        //  System.out.println(n1);

                        // System.out.println(s);
                        m_end1 = p_end1.matcher(s1);
                        boolean b2 = m_end1.find();
                        if (b2) {
                            n1 = m_end1.start();
                        }
                        //   System.out.println(n1);
                        s1 = s1.substring(0, n1);
                    //    System.out.println(s1);
//----------------------------------------------------------------------------
                    m_start2 = p_start2.matcher(s);

                    int n2 = 0;
                    b1 = m_start2.find();
                    if (b1) {
                        n2 = m_start2.end();
                    //  System.out.println(s.length());
                         s2 = s.substring(n2);
                    //  System.out.println(n1);
                    // System.out.println(s);
                         m_end2 = p_end2.matcher(s2);
                         b2 = m_end2.find();
                    if (b2) {
                        n2 = m_end2.start();
                    //   System.out.println(n1);
                        s2 = s2.substring(0, n2);
                    }
                    }else{
                        s2="NO";
                    }
                   // System.out.println(s2);
   //----------------------------------------------------------------------
                    s=s2+",,"+s1+"\r\n";
                    lstr.add(s);
                    System.out.println(s);
                   //break;
                  // sb.append(s);
                    //sb.append("");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        StringBuilder sb = new StringBuilder();
        for(String s:lstr){
            sb.append(s);
        }
        //Возвращаем полученный текст с файла
        return sb.toString();
    }
//уже не нужно
    private static String read2() {
        File fl=new File(str_PathName+"\\"+destFName+".txt");
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(fl));
            try {

                //В цикле построчно считываем файл
                String s;

                while ((s = in.readLine()) != null) {
                    int i=s.indexOf(',');//индекс первой запятой
                    int j=i+1;//индекс второй запятой
                    s=s.substring(j+1,s.length())+",,"+s.substring(0,i)+"\r\n";
                    System.out.println(s);
                    //break;
                    sb.append(s);
                    //sb.append("");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        //Возвращаем полученный текст с файла
        return sb.toString();
    }

 /*   private void makeTxtFile(String strPathName) throws FileNotFoundException, IOException{
        if(new File(strPathName+"\\nlsml.xml").exists()){
            nlsmlFilePath=new File(strPathName+"\\nlsml.xml");
        }else return;
        File fl=new File(resultDirName+"\\"+fName+".txt");

        String str="Sentence="+Pattern.compile("\\<\\/input.*").
                matcher(Pattern.compile(".*\\<input[^\\>]*\\>").
                        matcher(read(nlsmlFilePath)).replaceFirst("")).replaceFirst("")+".\r\n";
        str = new String(str);
        System.out.println(str);
        try (OutputStream out = new FileOutputStream(fl)) {
            byte[] winData = str.getBytes("Cp1251");
            out.write(winData);
        }
    }*/
    private static void makeTxtFile(String strPathName, String fileStr ) {
       // str_PathName=strPathName;
        File fl=new File(strPathName);
       try (OutputStream out = new FileOutputStream(fl)) {
            byte[] winData = fileStr.getBytes("UTF-8");
            out.write(winData);
        }catch(Exception e){

        }
       /* Path path1 = Paths.get(str_PathName+"\\"+destFName+".txt");

        Charset charset = Charset.forName("UTF-8");
        try {
            Files.write(path1,new String(fileStr.getBytes("UTF-8"), charset).getBytes(charset));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    TextFileReplacer(){
        String strPathName=str_PathName+"\\"+destFName+".txt";
        str=read();
        makeTxtFile(strPathName, str );
        str="";

    }

    public static void main(String[] args) {
        new TextFileReplacer();
     /*   String strPathName2=str_PathName+"\\"+destFName+"2.txt";
        str=read2();
        makeTxtFile(strPathName2, str);
        System.out.println(str);*/
   }
}
