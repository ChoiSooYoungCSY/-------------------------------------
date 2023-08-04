package kr.or.ddit.mem.life.golf;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.ddit.vo.GlfprUseRcordVO;
import kr.or.ddit.vo.PuttingRoomInfoVO;
import kr.or.ddit.vo.ReadrmUseRcordVO;
import kr.or.ddit.vo.SeatInfoVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/mem/life/glfpr")
public class GolfController {

	// DI. IoC (의존성 주입)
	@Inject
	GolfService golfService;

	@GetMapping("")
	public String selectSeat(Model model) {
		// 좌석 번호 리스트
		List<PuttingRoomInfoVO> selectRoom = this.golfService.selectRoom();
		log.info("selectRoom: " + selectRoom);

		model.addAttribute("selectRoom", selectRoom);


		return "mem/mem_life_golf_practive_range";
	}



}
