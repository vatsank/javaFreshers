package com.training.domains;

public class BloodDonor implements Comparable<BloodDonor>{
		
	private long donorId;
	private String donorName;
	private String bloodGroup;
	private long phoneNumber;
	
	public BloodDonor() {
		super();
	}

	public BloodDonor(String donorName, String bloodGroup, long phoneNumber) {
		super();
		this.donorName = donorName;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
	}
	
	public BloodDonor(long donorId, String donorName, String bloodGroup, long phoneNumber) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
	}

	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getDonorId() {
		return donorId;
	}
	public void setDonorId(long donorId) {
		this.donorId = donorId;
	}

	@Override
	public String toString() {
		return "BloodDonor [donorName=" + donorName + ", bloodGroup=" + bloodGroup + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	@Override
	public int compareTo(BloodDonor otherObject) {

		if(this.phoneNumber < otherObject.phoneNumber) return 1;
		if(this.phoneNumber > otherObject.phoneNumber) return -1;
			return 0;
	}
	
	
}
