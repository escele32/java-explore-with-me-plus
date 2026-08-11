package ru.practicum.stats.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EndpointHitDto {
    String app;
    String uri;
    String ip;
    String timestamp;
}
