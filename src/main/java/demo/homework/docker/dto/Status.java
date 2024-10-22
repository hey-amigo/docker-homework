package demo.homework.docker.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Status {

    @NonNull
    StatusCode status;

    public enum StatusCode {
        OK,
        ERROR
    }
}
