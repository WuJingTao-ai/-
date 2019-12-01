package cn.zjs.controller;

import cn.zjs.utlis.CheckSumBuilder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by AintccOut on 2019/11/19.
 */
@Controller
public class controllera {

    /*public static void main(String[] args) {
        String url = "http://localhost:8999/user/Query";
        HttpClient client = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet( url );
        try {
            CloseableHttpResponse response = (( CloseableHttpClient ) client).execute( httpGet );
            HttpEntity entity = response.getEntity();
            //将返回值转化成string的字符串
            String a = EntityUtils.toString( entity, "UTF-8" );
            System.out.println( a );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    @RequestMapping("cccc")
    public String query(ModelMap model) {
        String url = "http://localhost:8999/user/Query";
        HttpClient client = HttpClients.createDefault();
        HttpGet httpPost = new HttpGet( url );
        try {
            CloseableHttpResponse response = (( CloseableHttpClient ) client).execute( httpPost );
            HttpEntity entity = response.getEntity();
            //将返回值转化成string的字符串
            String result = EntityUtils.toString( entity, "UTF-8" );
            System.out.println( result );
            model.put( "info", result );
            return "aaa";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("n")
    public String q(String cellphone) {
        String url = "https://api.netease.im/sms/sendcode.action";
        String key = "41e422f4dac0aefbae25794a6bf9c082";
        String appSecret = "121071d9a9a0";
        String nonce = "123456";
        String moblie = cellphone;
        String TEMPLATEID = "14828147";
        String CODELEN = "6";
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost( url );
        String curTime = String.valueOf( (new Date()).getTime() / 1000L );
        String checkSum = CheckSumBuilder.getCheckSum( appSecret, nonce, curTime );
        httpPost.addHeader( "AppKey", key );
        httpPost.addHeader( "Nonce", nonce );
        httpPost.addHeader( "CurTime", curTime );
        httpPost.addHeader( "CheckSum", checkSum );
        httpPost.addHeader( "Content-Type", "application/x-www-form-urlencoded;charset=utf-8" );
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add( new BasicNameValuePair( "templateid", TEMPLATEID ) );
        nvps.add( new BasicNameValuePair( "mobile", moblie ) );
        nvps.add( new BasicNameValuePair( "codeLen", CODELEN ) );
        try {
            httpPost.setEntity( new UrlEncodedFormEntity( nvps, "utf-8" ) );
            // 执行请求
            HttpResponse response = httpClient.execute( httpPost );
            /*
             * 1.打印执行结果，打印结果一般会200、315、403、404、413、414、500
             * 2.具体的code有问题的可以参考官网的Code状态表
             */
            System.out.println( EntityUtils.toString( response.getEntity(), "utf-8" ) );
       /*     HttpResponse response = httpClient.execute(httpPost);
            String responseEntity= EntityUtils.toString(response.getEntity(),"utf-8");
            String obj= JSON.parseObject(responseEntity).getString("obj");
            System.out.println(obj);*/

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       /* String responseEntity= EntityUtils.toString(response.getEntity(),"utf-8");
        String code= JSON.parseObject(responseEntity).getString("code");*/
        return "成功";
    }

















    /* @RequestMapping("adda")

    public  String adda(String url, Map<String, String> parameterMap, CloseableHttpClient httpClient) {
      //声明http请求的方式
        HttpPost httpPost = new HttpPost(url);
        //处理参数
        if (parameterMap != null) {
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            parameterMap.entrySet().forEach(entry -> {
                String key = entry.getKey();
                String value = entry.getValue();
                list.add(new BasicNameValuePair(key, value));
            });
            try {
                //处理参数
                UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(list, "UTF-8");
                //将参数加入到http请求中
                httpPost.setEntity(urlEncodedFormEntity);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        //执行请求
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity,"UTF-8");
        } catch (HttpHostConnectException e) {
            e.printStackTrace();
            //服务器连接超时异常
            return "";
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }finally {
            if(response != null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }*/

}


