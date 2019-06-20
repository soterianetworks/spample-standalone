import {Component, Injector} from '@angular/core';

import {BaseComponent} from '../../common/base.component';
import {CipService} from '../cip.service';
import {CipUserProfile} from '../cip.model';

@Component({
    templateUrl: './detail.component.html',
    styleUrls: ['./detail.component.css'],
})
export class CipDetailComponent extends BaseComponent {
    cipService: CipService;
    currentUserProfile: CipUserProfile;

    constructor(protected injector: Injector) {
        super(injector);
        this.cipService = injector.get(CipService);
    }

    onInit() {
        this.cipService.getCurrentProfile().subscribe(userProfile => {
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

