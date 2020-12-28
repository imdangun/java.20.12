package ch07.ex02.case06.home.service;

import ch07.ex02.case06.home.dao.ScoreDao;
import ch07.ex02.case06.home.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		Score[] scores = scoreDao.selectScores();
		
		int sum = 0;
		int avg = 0;
		
		for(Score score: scores) {
			sum = score.getKorScore() + score.getEngScore() + score.getMathScore();
			avg = sum / 3;
			score.setSum(sum);
			score.setAvg(avg);
		}
		
		return scores;
	}
}
