package revature.fsd.project1.model;

public class Search {
	private String Keyword;

	public Search(String keyword) {
		super();
		Keyword = keyword;
	}

	public String getKeyword() {
		return Keyword;
	}

	public void setKeyword(String keyword) {
		Keyword = keyword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Keyword == null) ? 0 : Keyword.hashCode());
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
		Search other = (Search) obj;
		if (Keyword == null) {
			if (other.Keyword != null)
				return false;
		} else if (!Keyword.equals(other.Keyword))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Search [Keyword=" + Keyword + "]";
	}
	

}
