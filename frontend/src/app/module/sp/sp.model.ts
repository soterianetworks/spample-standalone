import {Base} from '../common/base.model';

export class SpUserProfile extends Base {
    password: string;
    username: string;
    authorities: Authority[];
    accountNonExpired: boolean;
    accountNonLocked: boolean;
    credentialsNonExpired: boolean;
    enabled: boolean;
    userId?: any;
    tenantId: string;
    tenantCode: string;
    country: string;
    language: string;
    email: string;
    mobile: string;
    groups: string[];
    departments: Department[];
}

export class Authority {
    authority: string;
}

export class Department {
    code: string;
    name: string;
}
