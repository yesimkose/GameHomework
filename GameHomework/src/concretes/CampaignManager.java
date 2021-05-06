package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya indirimi %"+campaign.getDiscount()+"'dir");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : "+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : "+campaign.getCampaignName());

		
	}

}
