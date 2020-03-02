package com.sapient.interview.cricket.service;

import com.sapient.interview.cricket.model.MatchInfo;
import com.sapient.interview.cricket.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CricketService {
	@Autowired
	private RestTemplate restTemplate;
	public Response getMatchDetails(String unique_id) throws ResponseStatusException {

		   String url = "https://cricapi.com/api/cricketScore?unique_id="+unique_id;
		   HttpHeaders headers = new HttpHeaders();
		   headers.set("apiKey", "WmPJrX2s3KMyZVPFwlm1vxXLXKw1");
		   HttpEntity<String> entity = new HttpEntity<String>(headers);

	       ResponseEntity<MatchInfo> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, MatchInfo.class);
	       System.out.println("Response"+responseEntity);
		   Response responseModel = getResponse(responseEntity);


		   if (responseEntity.getStatusCode().is2xxSuccessful()) {
			   return responseModel;
			   }else {
			   throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No details Found");
			   }
	   }
	
	private Response getResponse(ResponseEntity response){
		MatchInfo matchInfo = (MatchInfo) response.getBody();
		String teamName = getWinningTeamByScore(matchInfo.getScore());

		String winningTeam = teamName.replaceAll("[^a-zA-Z]", " ");

		String team1 = matchInfo.getTeam1();
		String team2 = matchInfo.getTeam2();

		if (team1.trim().equals(winningTeam.trim())) {
			team1 = matchInfo.getTeam1() + " [WINNER]";
		} else if (team2.trim().equals(winningTeam.trim())) {
			team2 = matchInfo.getTeam2() + " [WINNER]";
		}
		
		Matcher m = Pattern.compile("^*\\d*/\\d*").matcher(teamName);
		String winningTeamScore = null;
		while (m.find()) {
			winningTeamScore=m.group(0);
		}
		Response responseModel = new Response();

		responseModel.setTeam1(team1);
		responseModel.setTeam2(team2);
		responseModel.setWinningTeamSScore(winningTeamScore);
		responseModel.setRoundRotation(getRotatedValue(winningTeamScore));
		return responseModel;
	}
	
	private String getRotatedValue(String winningTeamScore2) {
		Matcher m = Pattern.compile("^*\\d*/\\d*").matcher(winningTeamScore2);
		String winningTeamScore=null;
		while (m.find()) {
			winningTeamScore=m.group(0);
		}
		String[] str=winningTeamScore.split("/");
		String test=str[1]+str[0]+"/";
		return test;
	}

	private String getWinningTeamByScore(String score) {
		String[] replacedSpace=score.split("v");
		String winningTeamName=null;
		for (String teamName : replacedSpace) {
			if(teamName.contains("*")) {
				winningTeamName=teamName;
			}
		}
		
		return winningTeamName;
	}
}
