package ch07.ex02.case06.home.service;

import ch07.ex02.case06.home.domain.Score;

public interface ScoreService {
	void addScore(Score score);
	Score[] getScores();
}
