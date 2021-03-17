package controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class OpenApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			String urlstr= "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaCode?ServiceKey=VNaqzDwNJ%2FOM63fE4jF24L%2Bjmj59Bi%2FUtih0EOI0rGttlzFNccoDOGBf2oJl7y7vdy%2B1AWZPVvEYcVEFgn%2FTUA%3D%3D&numOfRows=10&pageNo=1&MobileOS=ETC&MobileApp=TestApp&_type=json";
			URL url = new URL(urlstr);
			HttpURLConnection urlconnection = (HttpURLConnection)url.openConnection();
			urlconnection.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
			String result ="";
			String line;
			while((line = br.readLine())!=null) {
				result = result+line+"\n";
			}
			System.out.println(result);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
