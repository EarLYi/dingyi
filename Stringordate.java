import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stringordate {
public static void main(String args[]){
String s = "20090420";//要转换date类型字符串
SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");//设置间转换器
Date d = null;
try {
d = sf.parse(s);//字符串s通转换器转换date类型
} catch (ParseException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
System.out.println(d);//输date类型
System.out.println(sf.format(d));//输date类型d转换器表示形式打印

}
}