package com.devteam.service;

import com.devteam.entity.OperationLog;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface OperationLogService {
	List<OperationLog> getOperationLogListByDate(String startDate, String endDate);

	@Async
	void saveOperationLog(OperationLog log);

	void deleteOperationLogById(Long id);
}
