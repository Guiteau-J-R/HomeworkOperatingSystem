//a. The data involved in the race condition is available_resources

//b. The race conditon occurs in 2 lines:
//   available_resources -= count;
//   available_resources += count;

//c. Let's use binary semaphore to fix the race condition.
typedef struct {
int value = 1;
struct process *list;
} semaphore;

semaphore S;

//wait implementation
wait(semaphore *S) {
    if (S->value == 0){
    add this process to S->list;
    sleep();
    }
    S->value--
}

//signal implementation
signal(semaphore *S) {
    S->value++;
    if (!(S->list).isEmpty()) {
        remove a process P from S->list;
        wakeup(P);
    }
}
/////////////////////////////////////////////////////////////////
//increase_count and decrease_count functions
int decrease_count(int count) {
  wait(S);//call of wait before entering critical section
    if (available_resources < count){
      signal(S);//call of signal if ressorces wasn't found
      return -1;
    }
    else {
        available_resources -= count;
        signal(S);//call signal after modifying the resources
        return 0;
    }
}

int increase_count(int count){
  wait(S);//call of wait before entering critical section
  available_resources += count;//modifying resources
  signal(S);//call signal after modifying the ressources
}
