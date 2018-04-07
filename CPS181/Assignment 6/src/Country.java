
public class Country implements Comparable<Country> {
	
	private String country;
	private int population;
	private double growth;
	
	public Country(String country, int population, double growth) {
		this.country = country;
		this.population = population;
		this.growth = growth;
	}
	
	@Override
	public int compareTo(Country x) {
		return compareTo(x, 1);
	}
	
	// sortBy == 1 -> compare by name
	// sortBy == 2 -> compare by population
	// sortBy == 3 -> compare by growth rate
	public int compareTo(Country x, int sortBy) {
		if (sortBy == 1) { // Sort by name
			String thisCountry = country;
			String otherCountry = x.country;
			while (thisCountry.charAt(0) == otherCountry.charAt(0)) {
				thisCountry = thisCountry.substring(1);
				otherCountry = otherCountry.substring(1);
				if (thisCountry.length() < 1)
					return 1;
				if (otherCountry.length() < 1)
					return -1;
			}
			if (thisCountry.charAt(0) > otherCountry.charAt(0))
				return 1;
			return -1;
		}
		if (sortBy == 2) { // Sort by population
			if (population < x.population)
				return 1;
			if (population > x.population)
				return -1;
			return 0;
		}
		// Sort by growth rate
		if (growth < x.growth)
			return 1;
		if (growth > x.growth)
			return -1;
		return 0;
	}
	
	public String toString() {
		return String.format("%-35s Population: %-7d Growth Rate %f", country, population, growth);
	}
	
}
