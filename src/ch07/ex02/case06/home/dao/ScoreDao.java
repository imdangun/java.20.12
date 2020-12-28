package ch07.ex02.case06.home.dao;

import ch07.ex02.case06.home.domain.Score;

public interface ScoreDao {
	void insertScore(Score score);	
	Score[] selectScores();
}
