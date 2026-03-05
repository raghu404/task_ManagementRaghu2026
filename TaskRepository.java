package com.Raghavendraproject.TaskMange_springboot.Repository;




import com.Raghavendraproject.TaskMange_springboot.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;







public interface TaskRepository extends JpaRepository<Task, Long> {}
