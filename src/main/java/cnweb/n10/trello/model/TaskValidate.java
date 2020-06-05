package cnweb.n10.trello.model;

import org.springframework.util.StringUtils;

import java.util.Optional;

public class TaskValidate {

    public boolean isValid(Task task) {
        return Optional.ofNullable(task)
                .filter(t -> !StringUtils.isEmpty(t.getNAME()))
                .filter(t -> !StringUtils.isEmpty(t.getLID()))
                .filter(t -> !StringUtils.isEmpty(t.getBID()))
                .filter(t -> !StringUtils.isEmpty(t.getUSERNAME()))
                .isPresent();
    }
}
