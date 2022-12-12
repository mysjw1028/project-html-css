package site.metacoding.miniproject1.domain.subcribes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.subscribes.SubscribesRespListDto;



public interface SubscribesDao {
	// 기본기능
	public void insert(Subscribes subcribes);
	public List<Subscribes> findAll();
	public Subscribes findById(Integer id);
	public void update(Integer id, Subscribes subcribes);
	public void deleteById(Integer id);
	public List<SubscribesRespListDto> subcribesListPage(Integer id);
}
