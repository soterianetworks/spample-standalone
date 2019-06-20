import {Component, Injector} from '@angular/core';

import {BaseComponent} from '../../common/base.component';
import {SpService} from '../sp.service';
import {SpUserProfile} from '../sp.model';

@Component({
    templateUrl: './detail.component.html',
    styleUrls: ['./detail.component.css'],
})
export class SpDetailComponent extends BaseComponent {
    spService: SpService;
    currentUserProfile: SpUserProfile;

    constructor(protected injector: Injector) {
        super(injector);
        this.spService = injector.get(SpService);
    }

    onInit() {
        this.spService.getCurrentProfile().subscribe(userProfile => {
            this.currentUserProfile = userProfile;
        });
    }

    getDepartmentInfo() {
        const departmentNames: string[] = this.currentUserProfile.departments.map(item => item.name);
        return departmentNames.join(', ');
    }

    getUserGroupInfo() {
        return this.currentUserProfile.groups.join(', ');
    }
}

