package comp110.lecture27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ConceptBank {

	// Hands-on #1
	private List<String> _concepts;

	public ConceptBank() {
		_concepts = this.generateConcepts();
	}

	public int size() {
		return _concepts.size();
	}

	public String getConcept() {
		Random random = new Random();
		// Hands-on #2
		return "";
	}

	public Set<String> getConceptSet(int n) {
		// Hands-on #3
		return null;
	}

	public static List<String> generateConcepts() {
		List<String> words = new ArrayList<String>();

		words.add("int");
		words.add("double");
		words.add("boolean");
		words.add("String");
		words.add("variables");
		words.add("assignment");
		words.add("equality");
		words.add("inequalities");
		words.add("increment");
		words.add("arithmetic");
		words.add("integer division");
		words.add("modulus / remainder");
		words.add("concatenation");
		words.add("String literal");
		words.add("int literal");
		words.add("double literal");
		words.add("boolean literal");
		words.add("expression with operator");
		words.add("method calls (instance)");
		words.add("method calls (static)");
		words.add("return type");
		words.add("return statement");
		words.add("recursion");
		words.add("argument");
		words.add("parameter");
		words.add("if-then-else");
		words.add("else-if");
		words.add("while loop");
		words.add("for loop");
		words.add("for-each loop");
		words.add("array");
		words.add("list");
		words.add("map");
		words.add("set");
		words.add("swap");
		words.add("count (algo)");
		words.add("min (algo)");
		words.add("contains (algo)");
		words.add("linear vs binary search");
		words.add("concatenate arrays");
		words.add("reverse arrays");

		return words;
	}

}
