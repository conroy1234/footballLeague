package footballLeague;

import java.util.ArrayList;
import java.util.List;
/*
 * this class collect all the data from both home team and away team and return the results
 */
public class AddLeagueAndMatchesHome {
	
	/*
	 * get data for league table entry
	 */
	public static void leagueTableEntries(AddLeagueEntry addLeagueEntry) {
		List<LegueTableEntry> tableEntries = new ArrayList<>();
		 tableEntries.add(addLeagueEntry.getTableEntryForAwayTeam());
		 tableEntries.add(addLeagueEntry.getTableEntryForHomeTeam());
		 for(LegueTableEntry entry:tableEntries) {
			 System.out.println(entry);
		 }
	}

	/*
	 * get data for matches
	 */
	public static void matches(AddLeagueEntry addLeagueEntry) {
		List<Match> matches = addLeagueEntry.getMatches();
		LeagueTable leagueTable = new LeagueTable(matches);

		for (Match match : leagueTable.getMatches()) {
			System.out.println("Hame team :" + match.getHomeTeam());
			System.out.println("Away team :" + match.getAwayTeam());
			System.out.println("home Score:" + match.getHomeScore());
			System.out.println("Away Score:" + match.getAwayScore());
		}
	}
}
