package ru.itsjava.collections.sets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@Data
public class Fruit {
    private final String name;
    private double mass;
}
