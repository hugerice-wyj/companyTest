package com.cloud.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 22110334
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestUser implements Serializable {
    private int id;
    private String username;
    private String password;
}
