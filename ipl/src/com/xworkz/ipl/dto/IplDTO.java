package com.xworkz.ipl.dto;

public class IplDTO extends AbstractAuditDTO{
	
	private String teamName;
	private String captainName;
	private int extraPlayers;
	private boolean  won;
	private int noOfMatches;
	
	public IplDTO() {
		
		System.out.println("Running default const....");
	}
	
	

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captainName=" + captainName + ", extraPlayers=" + extraPlayers
				+ ", won=" + won + ", noOfMatches=" + noOfMatches + ", toString()=" + super.toString()
				+ ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedBy()="
				+ getUpdatedBy() + ", getUpdatedDate()=" + getUpdatedDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}



	public IplDTO(String teamName, String captainName, int extraPlayers, boolean won, int noOfMatches) {
		super();
		this.teamName = teamName;
		this.captainName = captainName;
		this.extraPlayers = extraPlayers;
		this.won = won;
		this.noOfMatches = noOfMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public int getExtraPlayers() {
		return extraPlayers;
	}

	public void setExtraPlayers(int extraPlayers) {
		this.extraPlayers = extraPlayers;
	}

	public boolean isWon() {
		return won;
	}

	public void setWon(boolean won) {
		this.won = won;
	}

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	
	

}
