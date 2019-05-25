package com.mockit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitTest {

    @Mock private List list;

    /**
     * 2.1 验证行为
     */
    @Test
    public void verify_behaviour(){
        Map map = Mockito.mock(Map.class);
        when(map.get("city")).thenReturn("chengdu");
        map.put("p", "gd");
        map.clear();
        verify(map).put(anyString(), anyString());
        verify(map).clear();
    }

    /**
     * 2.2 模拟我们所期望的结果
     */
    @Test
    public void mockittest1(){
        Map map = Mockito.mock(Map.class);
        when(map.get("city")).thenReturn("chengdu");
        Assert.assertEquals("chengdu", map.get("city"));
    }
    /**
     * 执行到特定步骤抛出异常
     */
    @Test
    public void throw_exception(){
        List list = Mockito.mock(List.class);
        list.add("dasda");
        doThrow(new NullPointerException()).when(list).add(anyString());
        list.add("asda");
    }
    /*
     * 使用RETURNS_SMART_NULLS参数创建的mock对象，
     * 不会抛出NullPointerException异常。
     * 另外控制台窗口会提示信息“SmartNull returned by unstubbed get() method on mock”
     */
    @Test
    public void returnsSmartNullsTest() {
        List mock = mock(List.class, RETURNS_SMART_NULLS);
        System.out.println(mock.get(2));
        System.out.println(mock.toArray().length);
    }
    /*
     * 2.13 重置mock
     */
    @Test
    public void reset_mock(){
        when(list.size()).thenReturn(10);
        Assert.assertEquals(10, list.size());;
        reset(list);
        Assert.assertEquals(0, list.size());;
    }

    /**
     * 2.14 验证确切的调用次数
     */
    @Test
    public void verifying_number_of_invocations(){
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        verify(list,times(1)).add(1);
        verify(list,times(2)).add(2);
        verify(list,times(3)).add(3);
    }

    /*
     * 2.16 验证执行顺序
     */
    @Test
    public void verification_in_order(){
        list.add(1);
        list.add(2);
        list.add(3);
        List list2=mock(List.class);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        InOrder inOrder = inOrder(list, list2);
        inOrder.verify(list).add(1);
        inOrder.verify(list).add(2);
        inOrder.verify(list2).add(1);
        inOrder.verify(list2).add(2);
    }

    /**
     * 2.17 确保模拟对象上无互动发生
     */
    @Test
    public void verify_interaction(){
        List list = mock(List.class);
        List list2 = mock(List.class);
        List list3 = mock(List.class);
        list.add(1);
        verify(list).add(1);
        verify(list,never()).add(2);
        //验证零互动行为
        verifyZeroInteractions(list2,list3);
    }













}
