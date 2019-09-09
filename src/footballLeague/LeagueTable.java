package footballLeague;

import java.util.List;

public class LeagueTable {

	private List<Match> matches;
	private List<LegueTableEntry> tableEntries;

	public LeagueTable(List<Match> matches) {
		this.matches = matches;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	public List<LegueTableEntry> getTableEntries() {
		return tableEntries;
	}

	public void setTableEntries(List<LegueTableEntry> tableEntries) {
		this.tableEntries = tableEntries;
	}
	
	
}
