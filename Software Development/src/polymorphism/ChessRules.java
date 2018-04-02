package polymorphism;

// another implementation
public class ChessRules implements RuleSet {
	
}

RuleSet rulesOfThisGame = new ChessRules();

if (rulesOfThisGame.isLegal(m,b)) {
	rulesOfThisGame.makeMove(m);
}
