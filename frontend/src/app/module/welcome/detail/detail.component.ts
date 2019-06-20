import {Component, Injector} from '@angular/core';

import {BaseComponent} from '../../common/base.component';

@Component({
    templateUrl: './detail.component.html',
    styleUrls: ['./detail.component.css'],
})
export class WelcomeComponent extends BaseComponent {

    machineMockData = [
        {
            'id': '1',
            'code': 'code1',
            'name': 'machine1',
        }, {
            'id': '2',
            'code': 'code2',
            'name': 'machine2',
        }, {
            'id': '3',
            'code': 'code3',
            'name': 'machine3',
        }, {
            'id': '4',
            'code': 'code4',
            'name': 'machine4',
        }, {
            'id': '5',
            'code': 'code5',
            'name': 'machine5',
        }, {
            'id': '6',
            'code': 'code6',
            'name': 'machine6',
        },
    ];

    commonSelectValue: string;
    multipleSelectValue: string[];
    filterSelectValue: string;
    searchSelectValue: string;
    tableSelectValue: string;
    pageSelectValue: string;
    comprehensiveSelectValue: string[];

    constructor(protected injector: Injector) {
        super(injector);
    }

    commonSelectProvider(event) {
        event.smartSelect.dataSource = this.machineMockData;
    }

    multipleSelectProvider(event) {
        event.smartSelect.dataSource = this.machineMockData;
    }

    filterSelectProvider(event) {
        event.smartSelect.dataSource = this.machineMockData;
    }

    searchSelectProvider(event) {
        event.smartSelect.dataSource = this.machineMockData;
    }

    tableSelectProvider(event) {
        event.smartSelect.dataSource = this.machineMockData;
    }

    pageSelectProvider(event) {
        event.smartSelect.dataSource = this.machineMockData;
    }

    comprehensiveSelectProvider(event) {
        event.smartSelect.dataSource = this.machineMockData;
    }
}

