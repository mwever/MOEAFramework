package org.moeaframework.problem;

import java.util.List;

import org.moeaframework.core.Solution;

public interface IBatchEvaluationProblem {

	public void evaluateAll(List<Solution> batch);

}
