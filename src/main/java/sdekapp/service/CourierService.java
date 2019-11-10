package sdekapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sdekapp.dao.CourierDao;
import sdekapp.dao.OperatorDao;
import sdekapp.dto.UserDto;

import java.util.List;

@Service("courierService")
@Transactional
public class CourierService {
    @Autowired
    private CourierDao courierDao;

    @Autowired
    private OperatorDao operatorDao;

    public List<String> getTasks(String userName){
        List<String> tasks = courierDao.findCourierTasks(userName);
        return tasks;
    }

    public void setTaskDisabled(String orderCode){
        Long courierTaskIdForDisabled = courierDao.getIdTaskForDisable(orderCode);
        courierDao.setTaskDisabled(courierTaskIdForDisabled);
        UserDto userDto = operatorDao.getOperatorForTask();
        operatorDao.createOperatorTask(userDto.getId(), courierTaskIdForDisabled);
    }
}
