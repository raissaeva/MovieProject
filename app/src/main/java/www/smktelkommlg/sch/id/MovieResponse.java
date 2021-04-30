package www.smktelkommlg.sch.id;

import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// Nama Field harus sama persis dengan response.
// alternatif pakai menambahkan @SerializedName("nama_field_response")
public class MovieResponse{
	@SerializedName("Response")
	private String response;
	@SerializedName("totalResults")
	private String totalResults;
	@SerializedName("Search")
	private List<SearchItem> search;


	public String getResponse(){
		return response;
	}

	public void setTotalResults(String totalResults){
		this.totalResults = totalResults;
	}

	public String getTotalResults(){
		return totalResults;
	}

	public void setSearch(List<SearchItem> search){
		this.search = search;
	}

	public List<SearchItem> getSearch(){
		return search;
	}
}
