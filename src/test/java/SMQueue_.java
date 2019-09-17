import es.ulpgc.SMQueue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SMQueue_ {
    @Test
    public void given_a_single_queue_return_the_sum_of_clients() {
        assertThat(SMQueue.timeToCheckoutOf(new Integer[]{ 5,3,4 }, 1)).isEqualTo(12);
        assertThat(SMQueue.timeToCheckoutOf(new Integer[]{ 5,9,4 }, 1)).isEqualTo(18);
    }

    @Test
    public void given_two_queues_return_the_sum_of_queue_with_more_clients_sum() {
        assertThat(SMQueue.timeToCheckoutOf(new Integer[]{ 5,3,4 },2)).isEqualTo(7);
    }
}
