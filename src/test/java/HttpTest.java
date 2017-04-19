import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by xmc1993 on 2017/2/26.
 */
public class HttpTest {
    public static void main(String[] args) throws Exception {
        httpRequestPost("http://sms.shumitech.com/login");
    }


    /**
     * http post 请求(未测试)
     *
     * @param urlStr
     * @throws Exception
     */
    public static void httpRequestPost(String urlStr) throws Exception {
        URL postUrl = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) postUrl
                .openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Charset", "UTF-8");
        connection.setRequestProperty("accept", "*/*");
        //与httpRequestPost()的不同，设置了块大小为5字节
//        connection.setChunkedStreamingMode(5);
        connection.connect();
        DataOutputStream out = new DataOutputStream(connection
                .getOutputStream());


        String content = "mobile=" + URLEncoder.encode("18658895709", "utf-8") + "&password=" + URLEncoder.encode("yqj123456", "utf-8");
        out.writeBytes(content);

        out.flush();
        out.close(); //到此时服务器已经收到了完整的http request了，而在httpRequestPost()函数里，要等到下一句getInputStream()服务器才能收到http请求。

        int resultCode = connection.getResponseCode();
        if (HttpURLConnection.HTTP_OK == resultCode) {
            StringBuffer sb = new StringBuffer();
            String readLine;
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            while ((readLine = responseReader.readLine()) != null) {
                sb.append(readLine).append("\n");
            }
            responseReader.close();
            System.out.println(sb.toString());
        }


//        System.out.println(connection.HTTP_OK);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(
//                connection.getInputStream()));

//        out.flush();
//        out.close();
//        String line;
//        System.out.println("==========post request开始==========");
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//        System.out.println("==========post request结束==========");
//        reader.close();
//        connection.disconnect();
    }
}
