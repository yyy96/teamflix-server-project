package com.example.demo.src.video;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.src.video.domain.Video;

@Repository
public class VideoDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public VideoDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Video.getVideoResDto> getVideosByGenre(int videoType, String genre) {
		String isMovieOrSeries = videoType == 0 ? "=" : "<";
		String query = "select V.* from GenreContact as GC "
			+ "left join Video as V on GC.videoIdx = V.videoIdx "
			+ "left join Genre as G on G.genreIdx = GC.genreIdx where G.name = ? and 0 " + isMovieOrSeries
			+ "V.season;";
		return this.jdbcTemplate.query(query,
			(rs, rowNum) -> new Video.getVideoResDto(
				rs.getInt("videoIdx"),
				rs.getInt("year"),
				rs.getInt("season"),
				rs.getInt("ageGrade"),
				rs.getString("title"),
				rs.getString("runningTime"),
				rs.getString("photoUrl"),
				rs.getString("summary"),
				rs.getString("director")
			),
			genre);
	}
}