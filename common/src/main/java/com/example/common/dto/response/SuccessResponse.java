package com.example.common.dto.response;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SuccessResponse {
  @NotNull
  private int status = 1;
}
