package site.metacoding.miniproject1.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.LikesService;
import site.metacoding.miniproject1.service.SubscribesService;
import site.metacoding.miniproject1.web.dto.request.likes.LikesRespListDto;
import site.metacoding.miniproject1.web.dto.response.subscribes.SubscribesRespListDto;

@RequiredArgsConstructor
@Controller
public class LikesController {
	private final LikesService likesService;

	@GetMapping("/likes/{id}")
	public String likesform(@PathVariable Integer id, Model model) {
		List<LikesRespListDto> likessList = likesService.좋아요목록(id);
		model.addAttribute("likessList", likessList);
		return "likes/likes";
	}

}
