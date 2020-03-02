1102 Assessment - 2 
Duration: 2 hours 
Problem statement: 
Develop, Test and Deploy a mirco-service which finds the total score of winning team in a cricket match using match unique id and round rotates the score. The service should be accessible via web browser on internet and end user should be able to view results by changing match's unique ID. Output of this service should be presented in web browser using any one of Javascript framework, HTML, JSON or plain text. And the service should be ready (in Git repository) to be released to production or live environment. In output, display following: 
Name of both teams
For the winning team, show (winner) along with team name Round rotated score of winning team 
Example:
Using Match-UniqueID: 1136617, service: https://cricapi.com/api/cricketScore and apikey=WmPJrX2s3KMyZVPFwlm1vxXLXKw1 The output should look like:
Run from terminal
WKMIN3029769:cricket-score alpha$ curl -X GET 'https://cricapi.com/api/cricketScore?unique_id=1136617&apikey=WmPJrX2s3KMyZVPFwlm1vxXLXKw1'

Response from https://cricapi.com/api/cricketScore API:
{
  "stat": "",
  "score": "Sunrisers Hyderabad 139/7  v Chennai Super Kings 140/8 *",
  "description": "Sunrisers Hyderabad 139/7  v Chennai Super Kings 140/8 *",
  "matchStarted": true,
  "team-1": "Sunrisers Hyderabad",
  "team-2": "Chennai Super Kings",
  "v": "1",
  "ttl": 4,
  "provider": {
    "source": "Various",
    "url": "https://cricapi.com/",
    "pubDate": "2020-03-02T08:40:48.967Z"
  },
  "creditsLeft": 250
}



Team-1: Sunrisers Hyderabad
Team-2: Chennai Super Kings (winner)
Winning team’s score: 140/8
Round rotation: 8140/ 
Use following for completion: 
1.	On your machine: 
1.	Eclipse IDE 
2.	Java 1.8 
3.	Maven 
4.	Putty 
5.	WinSCP client for file transfer 
6.	ZA Proxy 
7.	Selenium 
8.	JMeter 
9.	Internet access for search and research. In case you don't want to use any of the above listed tool, you can download any relevant tool or utility to complete the assessment. 
2.	API to fetch cricket data: http://cricapi.com/api/cricketScore Refer @ here for the details about this API 
3.	Github repository
a. Go to : https://github.com/ 
b. Sign-in using Username/password: PSEH-5/pseh-5@123 
c. Create a repository for your code
d. Check-in the code to complete the assessment 

4.	Jenkins is available to build and release the service at:
a. URL:http://ec2-18-216-246-227.us-east-2.compute.amazonaws.com/jenkins b. Username/password: user/rcd3TtOTI52f
c. Public IP: 18.216.246.227
d. SSH/SCP username: bitnami
e. Keyfile (for SSH/SCP access): "jenkins.pem" on your machine 
f. OS: Ubuntu Linux 
5.	VM to host the service is available at:
a. URL: http://ec2-13-58-144-95.us-east-2.compute.amazonaws.com/ b. Public IP: 13.58.144.95
c. SSH/SCP username: ubuntu
d. Keyfile (for SSH/SCP access): "jenkins.pem" on your machine
e. OS: Ubuntu Linux 




/*
Run from terminal
WKMIN3029769:cricket-score alpha$ curl -X GET 'https://cricapi.com/api/cricketScore?unique_id=1136617&apikey=WmPJrX2s3KMyZVPFwlm1vxXLXKw1'

Response from https://cricapi.com/api/cricketScore API:
{
  "stat": "",
  "score": "Sunrisers Hyderabad 139/7  v Chennai Super Kings 140/8 *",
  "description": "Sunrisers Hyderabad 139/7  v Chennai Super Kings 140/8 *",
  "matchStarted": true,
  "team-1": "Sunrisers Hyderabad",
  "team-2": "Chennai Super Kings",
  "v": "1",
  "ttl": 4,
  "provider": {
    "source": "Various",
    "url": "https://cricapi.com/",
    "pubDate": "2020-03-02T08:40:48.967Z"
  },
  "creditsLeft": 250
}

 */
