package com.sapient.interview.cricket.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"stat",
		"score",
		"description",
		"matchStarted",
		"team-1",
		"team-2",
		"v",
		"ttl",
		"provider",
		"creditsLeft"
})
public class MatchInfo implements Serializable
{

	@JsonProperty("stat")
	private String stat;
	@JsonProperty("score")
	private String score;
	@JsonProperty("description")
	private String description;
	@JsonProperty("matchStarted")
	private Boolean matchStarted;
	@JsonProperty("team-1")
	private String team1;
	@JsonProperty("team-2")
	private String team2;
	@JsonProperty("v")
	private String v;
	@JsonProperty("ttl")
	private Integer ttl;
	@JsonProperty("provider")
	private Provider provider;
	@JsonProperty("creditsLeft")
	private Integer creditsLeft;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -1326932144470663114L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public MatchInfo() {
	}

	/**
	 *
	 * @param score
	 * @param stat
	 * @param creditsLeft
	 * @param provider
	 * @param team1
	 * @param v
	 * @param team2
	 * @param description
	 * @param matchStarted
	 * @param ttl
	 */
	public MatchInfo(String stat, String score, String description, Boolean matchStarted, String team1, String team2, String v, Integer ttl, Provider provider, Integer creditsLeft) {
		super();
		this.stat = stat;
		this.score = score;
		this.description = description;
		this.matchStarted = matchStarted;
		this.team1 = team1;
		this.team2 = team2;
		this.v = v;
		this.ttl = ttl;
		this.provider = provider;
		this.creditsLeft = creditsLeft;
	}

	@JsonProperty("stat")
	public String getStat() {
		return stat;
	}

	@JsonProperty("stat")
	public void setStat(String stat) {
		this.stat = stat;
	}

	@JsonProperty("score")
	public String getScore() {
		return score;
	}

	@JsonProperty("score")
	public void setScore(String score) {
		this.score = score;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("matchStarted")
	public Boolean getMatchStarted() {
		return matchStarted;
	}

	@JsonProperty("matchStarted")
	public void setMatchStarted(Boolean matchStarted) {
		this.matchStarted = matchStarted;
	}

	@JsonProperty("team-1")
	public String getTeam1() {
		return team1;
	}

	@JsonProperty("team-1")
	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	@JsonProperty("team-2")
	public String getTeam2() {
		return team2;
	}

	@JsonProperty("team-2")
	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	@JsonProperty("v")
	public String getV() {
		return v;
	}

	@JsonProperty("v")
	public void setV(String v) {
		this.v = v;
	}

	@JsonProperty("ttl")
	public Integer getTtl() {
		return ttl;
	}

	@JsonProperty("ttl")
	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}

	@JsonProperty("provider")
	public Provider getProvider() {
		return provider;
	}

	@JsonProperty("provider")
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	@JsonProperty("creditsLeft")
	public Integer getCreditsLeft() {
		return creditsLeft;
	}

	@JsonProperty("creditsLeft")
	public void setCreditsLeft(Integer creditsLeft) {
		this.creditsLeft = creditsLeft;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "MatchInfo{" +
				"stat='" + stat + '\'' +
				", score='" + score + '\'' +
				", description='" + description + '\'' +
				", matchStarted=" + matchStarted +
				", team1='" + team1 + '\'' +
				", team2='" + team2 + '\'' +
				", v='" + v + '\'' +
				", ttl=" + ttl +
				", provider=" + provider +
				", creditsLeft=" + creditsLeft +
				", additionalProperties=" + additionalProperties +
				'}';
	}
}

