package ru.itsjava.iostreams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@AllArgsConstructor
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String login;
    private transient String password;

}
