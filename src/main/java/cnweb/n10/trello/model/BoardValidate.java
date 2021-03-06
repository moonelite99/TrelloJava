package cnweb.n10.trello.model;

import org.springframework.util.StringUtils;

import java.util.Optional;

public class BoardValidate {

    public boolean isValid(Board board) {
        return Optional.ofNullable(board)
                .filter(t -> !StringUtils.isEmpty(t.getNAME()))
                .filter(t -> !StringUtils.isEmpty(t.getBGR()))
                .filter(t -> !StringUtils.isEmpty(t.getUSERNAME()))
                .isPresent();
    }
}
