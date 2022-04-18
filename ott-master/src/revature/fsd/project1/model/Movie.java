package revature.fsd.project1.model;

public class Movie {
	private int id;
	private String name;
	private String genre;
	private double sales;
	private int year;
	
	//empty parameter constructor
	public Movie() {
		
	}
	//all parameter constructor

	public Movie(int id, String name, String genre, double sales, int year) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.sales = sales;
		this.year = year;
	}
	//getter setter methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	//hash code and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sales);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(sales) != Double.doubleToLongBits(other.sales))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	//to string()
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + "]";
	}
	
}