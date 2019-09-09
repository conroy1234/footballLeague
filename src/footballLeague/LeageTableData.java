package footballLeague;
/*
 * execute the results
 */
public class LeageTableData {

	public static void main(String[] args) {
		AddLeagueEntry addLeagueEntry = new AddLeagueEntry();
		AddLeagueAndMatchesHome.matches(addLeagueEntry);		
		AddLeagueAndMatchesHome.leagueTableEntries(addLeagueEntry);
		 
	}


	

}
