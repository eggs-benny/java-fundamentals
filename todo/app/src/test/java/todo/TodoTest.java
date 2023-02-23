package todo;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TodoTest {
  @Test
  public void testInitialisedEmptyList() {
    Todo todo = new Todo();
    assertTrue("Initial task list is empty", todo.tasks.isEmpty());
  }

  @Test
  public void testAddTaskToTodo() {
    Todo todo = new Todo();
    ArrayList<String> expectedList = new ArrayList<String>();
    expectedList.add("Buy Milk");

    assertEquals("Should reflect new task added", expectedList, todo.addTask("Buy Milk"));
  }

  @Test
  public void shouldReturnTodoList() {
    Todo todo = new Todo();
    ArrayList<String> expectedList = new ArrayList<String>();
    expectedList.add("Buy Milk");
    expectedList.add("Walk Dog");

    todo.addTask("Buy Milk");
    todo.addTask("Walk Dog");

    assertEquals("Should show full list", expectedList, todo.getTasks());
  }
}
