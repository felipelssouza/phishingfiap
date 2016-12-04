package service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;
import org.json.JSONObject;

import bean.Endereco;

public class ConsultaCEPService {
	
	private final String URL_VIA_CEP = "http://viacep.com.br/ws/?/json";
	
	public ConsultaCEPService() {}
	
	public Endereco consulaEnderecoPorCEP(String cep) throws Throwable{
	
		URL url = new URL(URL_VIA_CEP.replace("?", cep));
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        JSONObject jsonObject;
        String linha = "";

        StringBuilder jsonSb = new StringBuilder();
        
        while ((linha = br.readLine()) != null) {
        	jsonSb.append(linha.trim());
		}
        jsonObject = new JSONObject(jsonSb.toString());
        
        Endereco endereco = jsonToEndereco(jsonObject);
		
		return endereco;
		
	}

	private Endereco jsonToEndereco(JSONObject jObj) throws JSONException {
		
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro(jObj.get("logradouro").toString());
		endereco.setBairro(jObj.get("bairro").toString());
		endereco.setCidade(jObj.get("localidade").toString());
		endereco.setEstado(jObj.get("uf").toString());
		
		return endereco;
	}

}
