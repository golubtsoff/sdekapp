package sdekapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sdekapp.dao.OperatorDao;
import sdekapp.dto.OperatorTaskDto;

import java.util.List;

@Service("operatorService")
@Transactional
public class OperatorService {
    @Autowired
    private OperatorDao operatorDao;

    public List<OperatorTaskDto> getTasks(String userName){
        List<OperatorTaskDto> tasks = operatorDao.findOperatorTasks(userName);
        return tasks;
    }
}
