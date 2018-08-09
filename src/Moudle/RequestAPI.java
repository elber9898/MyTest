package Moudle;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class RequestAPI{
	
	public int doGet(String url) throws Exception{
		try {
			HttpClient client = HttpClients.createDefault();
			HttpGet get = new HttpGet(url);
			HttpResponse response = client.execute(get);
//			System.out.println(response);
			if(response.getStatusLine().getStatusCode()==200) {
				String strResult = EntityUtils.toString(response.getEntity());
				return 0;
			}else {
				return 1;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return 1;
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		RequestAPI request = new RequestAPI();
//		request.doGet("http://diamond-api.newifi.com/profit/data/topTenList");
//	}
}
