package com.anchor.global.exception.type.entity;

import com.anchor.global.exception.ServiceException;
import com.anchor.global.exception.error.ServiceErrorCode;
import com.anchor.global.exception.response.SimpleErrorDetail;

public class NotificationNotFoundException extends ServiceException {

  public NotificationNotFoundException() {
    super(ServiceErrorCode.ENTITY_NOT_FOUND, new SimpleErrorDetail("일치하는 알림이 존재하지 않습니다."));
  }

}
