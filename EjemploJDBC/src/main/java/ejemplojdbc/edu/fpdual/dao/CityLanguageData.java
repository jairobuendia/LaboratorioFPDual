package ejemplojdbc.edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CityLanguageData {

	private String cityName;
	private String cityLanguage;
	private float languagePercentage;
	private String countryCode;
	private String countryName;

	public CityLanguageData(ResultSet result) throws SQLException {
		this.cityName = result.getString(1);
		this.cityLanguage = result.getString("cityLanguage");
		this.languagePercentage = result.getFloat(3);
		this.countryCode = result.getString("code");
		this.countryName = result.getString("name");

	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityLanguage() {
		return cityLanguage;
	}

	public void setCityLanguage(String cityLanguage) {
		this.cityLanguage = cityLanguage;
	}

	public float getLanguagePercentage() {
		return languagePercentage;
	}

	public void setLanguagePercentage(float languagePercentage) {
		this.languagePercentage = languagePercentage;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
