package aljongjong.aol.service;

import aljongjong.aol.dto.BoardDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class BasicService {
    public List<BoardDto> getBoardList() {
        log.info("BoardService");
        List<BoardDto> list = new ArrayList<>();
        BoardDto dto = null;
        for(int i = 1; i <= 10; i++) {
            dto = new BoardDto();
            dto.setNo((long) i);
            dto.setTitle("제목 " + i);
            dto.setContents("내용 " + i);
            dto.setAuthor("작성자 " + i);
            dto.setDate(LocalDate.now());

            list.add(dto);
        }
        return list;
    }
}
