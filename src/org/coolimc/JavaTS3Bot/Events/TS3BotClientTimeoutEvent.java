package org.coolimc.JavaTS3Bot.Events;

public class TS3BotClientTimeoutEvent extends TS3BotClientLeaveEvent
{
	public TS3BotClientTimeoutEvent(TS3BotClientLeaveEvent basicEvent)
	{
		super(basicEvent);
	}
}
